// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRichTextResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public CreateRichTextResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateRichTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRichTextResponseBody self = new CreateRichTextResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRichTextResponseBody setData(CreateRichTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRichTextResponseBodyData getData() {
        return this.data;
    }

    public CreateRichTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateRichTextResponseBodyData extends TeaModel {
        // 资源id
        @NameInMap("instanceId")
        public Long instanceId;

        // 资源类型
        @NameInMap("instanceType")
        public Long instanceType;

        // 富文本内容
        @NameInMap("richText")
        public String richText;

        public static CreateRichTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRichTextResponseBodyData self = new CreateRichTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRichTextResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public CreateRichTextResponseBodyData setInstanceType(Long instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Long getInstanceType() {
            return this.instanceType;
        }

        public CreateRichTextResponseBodyData setRichText(String richText) {
            this.richText = richText;
            return this;
        }
        public String getRichText() {
            return this.richText;
        }

    }

}
