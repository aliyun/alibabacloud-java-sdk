// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListVscsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("NodeIds")
    public String nodeIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>rg-aek2xdkc6icwfha</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<ListVscsShrinkRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("VscName")
    public String vscName;

    public static ListVscsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVscsShrinkRequest self = new ListVscsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListVscsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVscsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVscsShrinkRequest setNodeIdsShrink(String nodeIdsShrink) {
        this.nodeIdsShrink = nodeIdsShrink;
        return this;
    }
    public String getNodeIdsShrink() {
        return this.nodeIdsShrink;
    }

    public ListVscsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVscsShrinkRequest setTag(java.util.List<ListVscsShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVscsShrinkRequestTag> getTag() {
        return this.tag;
    }

    public ListVscsShrinkRequest setVscName(String vscName) {
        this.vscName = vscName;
        return this;
    }
    public String getVscName() {
        return this.vscName;
    }

    public static class ListVscsShrinkRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key001</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value001</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVscsShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVscsShrinkRequestTag self = new ListVscsShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVscsShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVscsShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
