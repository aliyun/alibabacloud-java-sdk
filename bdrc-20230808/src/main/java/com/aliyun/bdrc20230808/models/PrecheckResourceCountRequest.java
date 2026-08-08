// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class PrecheckResourceCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagResourceMatchers")
    public java.util.List<PrecheckResourceCountRequestTagResourceMatchers> tagResourceMatchers;

    public static PrecheckResourceCountRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckResourceCountRequest self = new PrecheckResourceCountRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckResourceCountRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PrecheckResourceCountRequest setTagResourceMatchers(java.util.List<PrecheckResourceCountRequestTagResourceMatchers> tagResourceMatchers) {
        this.tagResourceMatchers = tagResourceMatchers;
        return this;
    }
    public java.util.List<PrecheckResourceCountRequestTagResourceMatchers> getTagResourceMatchers() {
        return this.tagResourceMatchers;
    }

    public static class PrecheckResourceCountRequestTagResourceMatchers extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CreatedBy</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static PrecheckResourceCountRequestTagResourceMatchers build(java.util.Map<String, ?> map) throws Exception {
            PrecheckResourceCountRequestTagResourceMatchers self = new PrecheckResourceCountRequestTagResourceMatchers();
            return TeaModel.build(map, self);
        }

        public PrecheckResourceCountRequestTagResourceMatchers setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PrecheckResourceCountRequestTagResourceMatchers setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public PrecheckResourceCountRequestTagResourceMatchers setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
