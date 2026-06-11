// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetUmodelCommonSchemaRefResponseBody extends TeaModel {
    /**
     * <p>The referenced common Umodel Schema.</p>
     */
    @NameInMap("commonSchemaRef")
    public java.util.List<GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef> commonSchemaRef;

    public static GetUmodelCommonSchemaRefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUmodelCommonSchemaRefResponseBody self = new GetUmodelCommonSchemaRefResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUmodelCommonSchemaRefResponseBody setCommonSchemaRef(java.util.List<GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef> commonSchemaRef) {
        this.commonSchemaRef = commonSchemaRef;
        return this;
    }
    public java.util.List<GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef> getCommonSchemaRef() {
        return this.commonSchemaRef;
    }

    public static class GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef extends TeaModel {
        /**
         * <p>The common Umodel Schema group.</p>
         * 
         * <strong>example:</strong>
         * <p>apm-common</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef build(java.util.Map<String, ?> map) throws Exception {
            GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef self = new GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef();
            return TeaModel.build(map, self);
        }

        public GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetUmodelCommonSchemaRefResponseBodyCommonSchemaRef setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
