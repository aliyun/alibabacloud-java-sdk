// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateRichTextResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public UpdateRichTextResponseBodyData data;

    // Id of the request
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
        // 富文本id
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
