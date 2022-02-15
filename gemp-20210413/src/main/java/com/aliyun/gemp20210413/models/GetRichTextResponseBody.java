// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRichTextResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GetRichTextResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetRichTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRichTextResponseBody self = new GetRichTextResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRichTextResponseBody setData(GetRichTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRichTextResponseBodyData getData() {
        return this.data;
    }

    public GetRichTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRichTextResponseBodyData extends TeaModel {
        // 资源id
        @NameInMap("instanceId")
        public Long instanceId;

        // 资源类型
        @NameInMap("instanceType")
        public Long instanceType;

        // 富文本内容
        @NameInMap("richText")
        public String richText;

        public static GetRichTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRichTextResponseBodyData self = new GetRichTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRichTextResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetRichTextResponseBodyData setInstanceType(Long instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Long getInstanceType() {
            return this.instanceType;
        }

        public GetRichTextResponseBodyData setRichText(String richText) {
            this.richText = richText;
            return this;
        }
        public String getRichText() {
            return this.richText;
        }

    }

}
