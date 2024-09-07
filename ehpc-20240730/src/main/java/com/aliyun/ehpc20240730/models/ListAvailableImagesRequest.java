// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableImagesRequest extends TeaModel {
    @NameInMap("DirectoryService")
    public ListAvailableImagesRequestDirectoryService directoryService;

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
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>SLURM</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
