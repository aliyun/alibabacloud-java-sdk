// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableImagesShrinkRequest extends TeaModel {
    @NameInMap("DirectoryService")
    public String directoryServiceShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableHT")
    public Boolean enableHT;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("HPCInterConnect")
    public String HPCInterConnect;

    /**
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <strong>example:</strong>
     * <p>ecs.c7.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPublic")
    public Boolean isPublic;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Scheduler")
    public String schedulerShrink;

    public static ListAvailableImagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableImagesShrinkRequest self = new ListAvailableImagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableImagesShrinkRequest setDirectoryServiceShrink(String directoryServiceShrink) {
        this.directoryServiceShrink = directoryServiceShrink;
        return this;
    }
    public String getDirectoryServiceShrink() {
        return this.directoryServiceShrink;
    }

    public ListAvailableImagesShrinkRequest setEnableHT(Boolean enableHT) {
        this.enableHT = enableHT;
        return this;
    }
    public Boolean getEnableHT() {
        return this.enableHT;
    }

    public ListAvailableImagesShrinkRequest setHPCInterConnect(String HPCInterConnect) {
        this.HPCInterConnect = HPCInterConnect;
        return this;
    }
    public String getHPCInterConnect() {
        return this.HPCInterConnect;
    }

    public ListAvailableImagesShrinkRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public ListAvailableImagesShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListAvailableImagesShrinkRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public ListAvailableImagesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAvailableImagesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAvailableImagesShrinkRequest setSchedulerShrink(String schedulerShrink) {
        this.schedulerShrink = schedulerShrink;
        return this;
    }
    public String getSchedulerShrink() {
        return this.schedulerShrink;
    }

}
