// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactLifecycleRuleRequest extends TeaModel {
    /**
     * <p>Indicates whether automatic tag deletion is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDeleteTag")
    public Boolean enableDeleteTag;

    /**
     * <p>The ID of the Enterprise Edition instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-eztul9ucz76q****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return per page. The maximum value is 100. If you specify a value greater than 100, the system may return a parameter error or use a page size of 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListArtifactLifecycleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactLifecycleRuleRequest self = new ListArtifactLifecycleRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactLifecycleRuleRequest setEnableDeleteTag(Boolean enableDeleteTag) {
        this.enableDeleteTag = enableDeleteTag;
        return this;
    }
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
    }

    public ListArtifactLifecycleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListArtifactLifecycleRuleRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListArtifactLifecycleRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
