// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetInstancePropertiesResponseBody extends TeaModel {
    @NameInMap("PropertyTemplateModel")
    public GetInstancePropertiesResponseBodyPropertyTemplateModel propertyTemplateModel;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstancePropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstancePropertiesResponseBody self = new GetInstancePropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstancePropertiesResponseBody setPropertyTemplateModel(GetInstancePropertiesResponseBodyPropertyTemplateModel propertyTemplateModel) {
        this.propertyTemplateModel = propertyTemplateModel;
        return this;
    }
    public GetInstancePropertiesResponseBodyPropertyTemplateModel getPropertyTemplateModel() {
        return this.propertyTemplateModel;
    }

    public GetInstancePropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstancePropertiesResponseBodyPropertyTemplateModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{ &quot;propties&quot;:{&quot;key1&quot;:&quot;value1&quot;}}</p>
         */
        @NameInMap("Content")
        public String content;

        public static GetInstancePropertiesResponseBodyPropertyTemplateModel build(java.util.Map<String, ?> map) throws Exception {
            GetInstancePropertiesResponseBodyPropertyTemplateModel self = new GetInstancePropertiesResponseBodyPropertyTemplateModel();
            return TeaModel.build(map, self);
        }

        public GetInstancePropertiesResponseBodyPropertyTemplateModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
