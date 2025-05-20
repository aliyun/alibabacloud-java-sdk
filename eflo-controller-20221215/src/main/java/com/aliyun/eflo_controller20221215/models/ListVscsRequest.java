// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListVscsRequest extends TeaModel {
    /**
     * <p>The maximum number of data records to be read in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Marks the position to start reading from. If empty, it starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>List of node IDs</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>Resource group ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2xdkc6icwfha</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>List of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListVscsRequestTag> tag;

    /**
     * <p>Vsc name</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("VscName")
    public String vscName;

    public static ListVscsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVscsRequest self = new ListVscsRequest();
        return TeaModel.build(map, self);
    }

    public ListVscsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVscsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVscsRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ListVscsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVscsRequest setTag(java.util.List<ListVscsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVscsRequestTag> getTag() {
        return this.tag;
    }

    public ListVscsRequest setVscName(String vscName) {
        this.vscName = vscName;
        return this;
    }
    public String getVscName() {
        return this.vscName;
    }

    public static class ListVscsRequestTag extends TeaModel {
        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key001</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value001</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVscsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVscsRequestTag self = new ListVscsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVscsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVscsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
