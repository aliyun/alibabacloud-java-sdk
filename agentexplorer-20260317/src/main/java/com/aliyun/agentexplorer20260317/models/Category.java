// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class Category extends TeaModel {
    @NameInMap("children")
    public java.util.List<CategoryChildren> children;

    /**
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("name")
    public String name;

    public static Category build(java.util.Map<String, ?> map) throws Exception {
        Category self = new Category();
        return TeaModel.build(map, self);
    }

    public Category setChildren(java.util.List<CategoryChildren> children) {
        this.children = children;
        return this;
    }
    public java.util.List<CategoryChildren> getChildren() {
        return this.children;
    }

    public Category setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CategoryChildren extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("name")
        public String name;

        public static CategoryChildren build(java.util.Map<String, ?> map) throws Exception {
            CategoryChildren self = new CategoryChildren();
            return TeaModel.build(map, self);
        }

        public CategoryChildren setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CategoryChildren setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
