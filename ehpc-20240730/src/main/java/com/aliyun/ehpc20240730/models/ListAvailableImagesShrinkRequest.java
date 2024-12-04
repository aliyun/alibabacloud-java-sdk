// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableImagesShrinkRequest extends TeaModel {
    /**
     * <p>The information about the domain account service.</p>
     */
    @NameInMap("DirectoryService")
    public String directoryServiceShrink;

    /**
     * <p>Specifies whether to return images in which hyper-threading is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableHT")
    public Boolean enableHT;

    /**
     * <p>The network type of the images that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("HPCInterConnect")
    public String HPCInterConnect;

    /**
     * <p>The image source. Valid values:</p>
     * <ul>
     * <li>system: system image.</li>
     * <li>self: custom image.</li>
     * <li>others: shared image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The instance type.</p>
     * <blockquote>
     * <p> By default, if you do not specify an instance type, the list of images that are supported by all instance types are queried. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.c7.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to return published community images. Valid values:</p>
     * <ul>
     * <li>true: returns published community images. If you set the value of this parameter to <code>true</code>, the <code>ImageOwnerAlias</code> parameter must be set to <code>others</code>.</li>
     * <li>false: returns non-community images. The value of the <code>ImageOwnerAlias</code> parameter prevails.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPublic")
    public Boolean isPublic;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The scheduler information about the images that you want to query.</p>
     */
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
