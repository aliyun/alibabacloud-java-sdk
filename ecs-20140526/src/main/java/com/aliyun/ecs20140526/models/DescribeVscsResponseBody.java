// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVscsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-**-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>VSC</p>
     */
    @NameInMap("Vscs")
    public java.util.List<DescribeVscsResponseBodyVscs> vscs;

    public static DescribeVscsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscsResponseBody self = new DescribeVscsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVscsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVscsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVscsResponseBody setVscs(java.util.List<DescribeVscsResponseBodyVscs> vscs) {
        this.vscs = vscs;
        return this;
    }
    public java.util.List<DescribeVscsResponseBodyVscs> getVscs() {
        return this.vscs;
    }

    public static class DescribeVscsResponseBodyVscsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeVscsResponseBodyVscsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVscsResponseBodyVscsTags self = new DescribeVscsResponseBodyVscsTags();
            return TeaModel.build(map, self);
        }

        public DescribeVscsResponseBodyVscsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeVscsResponseBodyVscsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeVscsResponseBodyVscs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ali***-post-cn-j4g45iqze00f</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>i-uf69***21l8zuoizdq</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>rg-aek2zex4ehdyjvq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>In_use</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<DescribeVscsResponseBodyVscsTags> tags;

        /**
         * <p>VSC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-hp34ue**g0wmycb27bwal</p>
         */
        @NameInMap("VscId")
        public String vscId;

        /**
         * <strong>example:</strong>
         * <p>test-vsc</p>
         */
        @NameInMap("VscName")
        public String vscName;

        /**
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("VscType")
        public String vscType;

        public static DescribeVscsResponseBodyVscs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVscsResponseBodyVscs self = new DescribeVscsResponseBodyVscs();
            return TeaModel.build(map, self);
        }

        public DescribeVscsResponseBodyVscs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVscsResponseBodyVscs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVscsResponseBodyVscs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVscsResponseBodyVscs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVscsResponseBodyVscs setTags(java.util.List<DescribeVscsResponseBodyVscsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeVscsResponseBodyVscsTags> getTags() {
            return this.tags;
        }

        public DescribeVscsResponseBodyVscs setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public DescribeVscsResponseBodyVscs setVscName(String vscName) {
            this.vscName = vscName;
            return this;
        }
        public String getVscName() {
            return this.vscName;
        }

        public DescribeVscsResponseBodyVscs setVscType(String vscType) {
            this.vscType = vscType;
            return this;
        }
        public String getVscType() {
            return this.vscType;
        }

    }

}
