// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLogContentsResponseBody extends TeaModel {
    @NameInMap("listLogContent")
    public ListLogContentsResponseBodyListLogContent listLogContent;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListLogContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogContentsResponseBody self = new ListLogContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogContentsResponseBody setListLogContent(ListLogContentsResponseBodyListLogContent listLogContent) {
        this.listLogContent = listLogContent;
        return this;
    }
    public ListLogContentsResponseBodyListLogContent getListLogContent() {
        return this.listLogContent;
    }

    public ListLogContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLogContentsResponseBodyListLogContentContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>spark pi is 3.14\n</p>
         */
        @NameInMap("LineContent")
        public String lineContent;

        public static ListLogContentsResponseBodyListLogContentContents build(java.util.Map<String, ?> map) throws Exception {
            ListLogContentsResponseBodyListLogContentContents self = new ListLogContentsResponseBodyListLogContentContents();
            return TeaModel.build(map, self);
        }

        public ListLogContentsResponseBodyListLogContentContents setLineContent(String lineContent) {
            this.lineContent = lineContent;
            return this;
        }
        public String getLineContent() {
            return this.lineContent;
        }

    }

    public static class ListLogContentsResponseBodyListLogContent extends TeaModel {
        @NameInMap("contents")
        public java.util.List<ListLogContentsResponseBodyListLogContentContents> contents;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalLength")
        public Long totalLength;

        public static ListLogContentsResponseBodyListLogContent build(java.util.Map<String, ?> map) throws Exception {
            ListLogContentsResponseBodyListLogContent self = new ListLogContentsResponseBodyListLogContent();
            return TeaModel.build(map, self);
        }

        public ListLogContentsResponseBodyListLogContent setContents(java.util.List<ListLogContentsResponseBodyListLogContentContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<ListLogContentsResponseBodyListLogContentContents> getContents() {
            return this.contents;
        }

        public ListLogContentsResponseBodyListLogContent setTotalLength(Long totalLength) {
            this.totalLength = totalLength;
            return this;
        }
        public Long getTotalLength() {
            return this.totalLength;
        }

    }

}
