// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeMountPointsVscAttachInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MYR6sz6qkmauspAy8oxjHP-tOLtD4KSv3DzI7G6iywTx1ZCExO50GtSuiTB9z0JppvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QueryInfos")
    public java.util.List<DescribeMountPointsVscAttachInfoRequestQueryInfos> queryInfos;

    /**
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
         * <strong>example:</strong>
         * <p>i-2zehyz70ednszl6rrfj6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>f-9dd3c6bajmy110.cn-zhangjiakou.dfs.aliyuncs.com</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        /**
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
