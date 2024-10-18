// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableImagesRequest extends TeaModel {
    /**
     * <p>The information about the domain account service.</p>
     */
    @NameInMap("DirectoryService")
    public ListAvailableImagesRequestDirectoryService directoryService;

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
     * <li>system: system images</li>
     * <li>self: custom images</li>
     * <li>others: shared images</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The instance type for which you want to query available images. If you do not specify the instance type, all available images are returned, regardless of the supported instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c7.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to return published community images. Valid values:</p>
     * <ul>
     * <li>true: returns published community images. If you set the value of this parameter to true, the ImageOwnerAlias parameter must be set to others.</li>
     * <li>false: returns non-community images. The value of the ImageOwnerAlias parameter prevails.</li>
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
    public ListAvailableImagesRequestScheduler scheduler;

    public static ListAvailableImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableImagesRequest self = new ListAvailableImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableImagesRequest setDirectoryService(ListAvailableImagesRequestDirectoryService directoryService) {
        this.directoryService = directoryService;
        return this;
    }
    public ListAvailableImagesRequestDirectoryService getDirectoryService() {
        return this.directoryService;
    }

    public ListAvailableImagesRequest setEnableHT(Boolean enableHT) {
        this.enableHT = enableHT;
        return this;
    }
    public Boolean getEnableHT() {
        return this.enableHT;
    }

    public ListAvailableImagesRequest setHPCInterConnect(String HPCInterConnect) {
        this.HPCInterConnect = HPCInterConnect;
        return this;
    }
    public String getHPCInterConnect() {
        return this.HPCInterConnect;
    }

    public ListAvailableImagesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public ListAvailableImagesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListAvailableImagesRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public ListAvailableImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAvailableImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAvailableImagesRequest setScheduler(ListAvailableImagesRequestScheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public ListAvailableImagesRequestScheduler getScheduler() {
        return this.scheduler;
    }

    public static class ListAvailableImagesRequestDirectoryService extends TeaModel {
        /**
         * <p>The type of the domain account.</p>
         * 
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the domain account service.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAvailableImagesRequestDirectoryService build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableImagesRequestDirectoryService self = new ListAvailableImagesRequestDirectoryService();
            return TeaModel.build(map, self);
        }

        public ListAvailableImagesRequestDirectoryService setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAvailableImagesRequestDirectoryService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAvailableImagesRequestScheduler extends TeaModel {
        /**
         * <p>The scheduler type.</p>
         * 
         * <strong>example:</strong>
         * <p>SLURM</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The scheduler version.</p>
         * 
         * <strong>example:</strong>
         * <p>22.05.8</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAvailableImagesRequestScheduler build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableImagesRequestScheduler self = new ListAvailableImagesRequestScheduler();
            return TeaModel.build(map, self);
        }

        public ListAvailableImagesRequestScheduler setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAvailableImagesRequestScheduler setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
