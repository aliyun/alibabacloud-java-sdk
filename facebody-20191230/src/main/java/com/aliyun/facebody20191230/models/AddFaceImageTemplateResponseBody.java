// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddFaceImageTemplateResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddFaceImageTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceImageTemplateResponseBody self = new AddFaceImageTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceImageTemplateResponseBody setData(AddFaceImageTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceImageTemplateResponseBodyData getData() {
        return this.data;
    }

    public AddFaceImageTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddFaceImageTemplateResponseBodyData extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        public static AddFaceImageTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceImageTemplateResponseBodyData self = new AddFaceImageTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFaceImageTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
