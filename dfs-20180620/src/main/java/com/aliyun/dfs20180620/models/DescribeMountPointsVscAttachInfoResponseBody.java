// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeMountPointsVscAttachInfoResponseBody extends TeaModel {
    @NameInMap("AttachInfos")
    public java.util.List<DescribeMountPointsVscAttachInfoResponseBodyAttachInfos> attachInfos;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>asd0daj****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeMountPointsVscAttachInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountPointsVscAttachInfoResponseBody self = new DescribeMountPointsVscAttachInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMountPointsVscAttachInfoResponseBody setAttachInfos(java.util.List<DescribeMountPointsVscAttachInfoResponseBodyAttachInfos> attachInfos) {
        this.attachInfos = attachInfos;
        return this;
    }
    public java.util.List<DescribeMountPointsVscAttachInfoResponseBodyAttachInfos> getAttachInfos() {
        return this.attachInfos;
    }

    public DescribeMountPointsVscAttachInfoResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeMountPointsVscAttachInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMountPointsVscAttachInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMountPointsVscAttachInfoResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMountPointsVscAttachInfoResponseBodyAttachInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsc-agent-f5a9bb4b041541f595a0c239c9e0f971-cn-shanghai</p>
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
         * <p>vsc-bp18fhqie89loyqixyieal</p>
         */
        @NameInMap("VscId")
        public String vscId;

        /**
         * <strong>example:</strong>
         * <p>cxc</p>
         */
        @NameInMap("VscName")
        public String vscName;

        @NameInMap("VscStatus")
        public String vscStatus;

        /**
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("VscType")
        public String vscType;

        public static DescribeMountPointsVscAttachInfoResponseBodyAttachInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountPointsVscAttachInfoResponseBodyAttachInfos self = new DescribeMountPointsVscAttachInfoResponseBodyAttachInfos();
            return TeaModel.build(map, self);
        }

        public DescribeMountPointsVscAttachInfoResponseBodyAttachInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMountPointsVscAttachInfoResponseBodyAttachInfos setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public DescribeMountPointsVscAttachInfoResponseBodyAttachInfos setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public DescribeMountPointsVscAttachInfoResponseBodyAttachInfos setVscName(String vscName) {
            this.vscName = vscName;
            return this;
        }
        public String getVscName() {
            return this.vscName;
        }

        public DescribeMountPointsVscAttachInfoResponseBodyAttachInfos setVscStatus(String vscStatus) {
            this.vscStatus = vscStatus;
            return this;
        }
        public String getVscStatus() {
            return this.vscStatus;
        }

        public DescribeMountPointsVscAttachInfoResponseBodyAttachInfos setVscType(String vscType) {
            this.vscType = vscType;
            return this;
        }
        public String getVscType() {
            return this.vscType;
        }

    }

}
