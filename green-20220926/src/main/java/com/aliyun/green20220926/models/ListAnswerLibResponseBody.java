// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAnswerLibResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAnswerLibResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAnswerLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnswerLibResponseBody self = new ListAnswerLibResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnswerLibResponseBody setData(java.util.List<ListAnswerLibResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAnswerLibResponseBodyData> getData() {
        return this.data;
    }

    public ListAnswerLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAnswerLibResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AnswerCount")
        public Integer answerCount;

        /**
         * <strong>example:</strong>
         * <p>2024-06-03 18:15:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>alxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        @NameInMap("LibName")
        public String libName;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>1643953****74290</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static ListAnswerLibResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnswerLibResponseBodyData self = new ListAnswerLibResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnswerLibResponseBodyData setAnswerCount(Integer answerCount) {
            this.answerCount = answerCount;
            return this;
        }
        public Integer getAnswerCount() {
            return this.answerCount;
        }

        public ListAnswerLibResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAnswerLibResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ListAnswerLibResponseBodyData setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

        public ListAnswerLibResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
