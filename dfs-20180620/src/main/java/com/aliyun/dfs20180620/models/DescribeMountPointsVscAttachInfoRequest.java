// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeMountPointsVscAttachInfoRequest extends TeaModel {
    /**
     * <p>The region where the file system resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>The maximum number of entries to return per page during paging in a paged query. Maximum value: 100. Default value: 10. If you do not specify a value in the Settings or the value in the Settings is less than 10, the default value 10 is used. If the value in the Settings is greater than 100, the default value 100 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. If a query does not return all results, a non-empty NextToken is returned. You can use the returned NextToken in a subsequent query to retrieve the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>MYR6sz6qkmauspAy8oxjHP-tOLtD4KSv3DzI7G6iywTx1ZCExO50GtSuiTB9z0JppvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of query information.</p>
     */
    @NameInMap("QueryInfos")
    public java.util.List<DescribeMountPointsVscAttachInfoRequestQueryInfos> queryInfos;

    /**
     * <p>Specifies whether to use the assumed role to check the permissions of the compute node. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false (default): No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    public static DescribeMountPointsVscAttachInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountPointsVscAttachInfoRequest self = new DescribeMountPointsVscAttachInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMountPointsVscAttachInfoRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DescribeMountPointsVscAttachInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeMountPointsVscAttachInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMountPointsVscAttachInfoRequest setQueryInfos(java.util.List<DescribeMountPointsVscAttachInfoRequestQueryInfos> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<DescribeMountPointsVscAttachInfoRequestQueryInfos> getQueryInfos() {
        return this.queryInfos;
    }

    public DescribeMountPointsVscAttachInfoRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public static class DescribeMountPointsVscAttachInfoRequestQueryInfos extends TeaModel {
        /**
         * <p>The instance ID of the ECS instance on which the HDFS file system is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zehyz70ednszl6rrfj6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the mount point.</p>
         * 
         * <strong>example:</strong>
         * <p>f-9dd3c6bajmy110.cn-zhangjiakou.dfs.aliyuncs.com</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        /**
         * <p>The ID of the VSC on which the HDFS file system is mounted. You must specify either InstanceId or VscId, but not both.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-bp19yqmujug2r18z0h9qal</p>
         */
        @NameInMap("VscId")
        public String vscId;

        public static DescribeMountPointsVscAttachInfoRequestQueryInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountPointsVscAttachInfoRequestQueryInfos self = new DescribeMountPointsVscAttachInfoRequestQueryInfos();
            return TeaModel.build(map, self);
        }

        public DescribeMountPointsVscAttachInfoRequestQueryInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMountPointsVscAttachInfoRequestQueryInfos setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public DescribeMountPointsVscAttachInfoRequestQueryInfos setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

    }

}
