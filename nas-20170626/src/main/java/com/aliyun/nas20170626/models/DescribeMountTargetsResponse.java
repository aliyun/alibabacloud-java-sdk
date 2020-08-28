// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("MountTargets")
    @Validation(required = true)
    public DescribeMountTargetsResponseMountTargets mountTargets;

    public static DescribeMountTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsResponse self = new DescribeMountTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMountTargetsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeMountTargetsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountTargetsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountTargetsResponse setMountTargets(DescribeMountTargetsResponseMountTargets mountTargets) {
        this.mountTargets = mountTargets;
        return this;
    }
    public DescribeMountTargetsResponseMountTargets getMountTargets() {
        return this.mountTargets;
    }

    public static class DescribeMountTargetsResponseMountTargetsMountTarget extends TeaModel {
        @NameInMap("MountTargetDomain")
        @Validation(required = true)
        public String mountTargetDomain;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VswId")
        @Validation(required = true)
        public String vswId;

        @NameInMap("AccessGroup")
        @Validation(required = true)
        public String accessGroup;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeMountTargetsResponseMountTargetsMountTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseMountTargetsMountTarget self = new DescribeMountTargetsResponseMountTargetsMountTarget();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseMountTargetsMountTarget setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeMountTargetsResponseMountTargetsMountTarget setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeMountTargetsResponseMountTargetsMountTarget setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeMountTargetsResponseMountTargetsMountTarget setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public DescribeMountTargetsResponseMountTargetsMountTarget setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public DescribeMountTargetsResponseMountTargetsMountTarget setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMountTargetsResponseMountTargets extends TeaModel {
        @NameInMap("MountTarget")
        @Validation(required = true)
        public java.util.List<DescribeMountTargetsResponseMountTargetsMountTarget> mountTarget;

        public static DescribeMountTargetsResponseMountTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseMountTargets self = new DescribeMountTargetsResponseMountTargets();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseMountTargets setMountTarget(java.util.List<DescribeMountTargetsResponseMountTargetsMountTarget> mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }
        public java.util.List<DescribeMountTargetsResponseMountTargetsMountTarget> getMountTarget() {
            return this.mountTarget;
        }

    }

}
