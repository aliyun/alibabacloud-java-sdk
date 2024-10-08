// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateRichTextResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public UpdateRichTextResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateRichTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRichTextResponseBody self = new UpdateRichTextResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRichTextResponseBody setData(UpdateRichTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRichTextResponseBodyData getData() {
        return this.data;
    }

    public UpdateRichTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateRichTextResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("id")
        public Long id;

        public static UpdateRichTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRichTextResponseBodyData self = new UpdateRichTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRichTextResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
