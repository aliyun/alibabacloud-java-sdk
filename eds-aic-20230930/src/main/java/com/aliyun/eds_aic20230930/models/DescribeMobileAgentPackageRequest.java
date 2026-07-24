// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>The list of node instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The list of package IDs.</p>
     */
    @NameInMap("PackageIds")
    public java.util.List<String> packageIds;

    /**
     * <p>The package specification.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("PackageSpec")
    public String packageSpec;

    /**
     * <p>The package status.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("PackageStatus")
    public String packageStatus;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeMobileAgentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackageRequest self = new DescribeMobileAgentPackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackageRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMobileAgentPackageRequest setPackageIds(java.util.List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    public DescribeMobileAgentPackageRequest setPackageSpec(String packageSpec) {
        this.packageSpec = packageSpec;
        return this;
    }
    public String getPackageSpec() {
        return this.packageSpec;
    }

    public DescribeMobileAgentPackageRequest setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
        return this;
    }
    public String getPackageStatus() {
        return this.packageStatus;
    }

    public DescribeMobileAgentPackageRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeMobileAgentPackageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
