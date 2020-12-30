// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListBackupsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public ListBackupsResponseBodyItems items;

    public static ListBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackupsResponseBody self = new ListBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBackupsResponseBody setItems(ListBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListBackupsResponseBodyItemsItemMetadataInfo extends TeaModel {
        @NameInMap("MetadataType")
        public String metadataType;

        @NameInMap("Properties")
        public String properties;

        public static ListBackupsResponseBodyItemsItemMetadataInfo build(java.util.Map<String, ?> map) throws Exception {
            ListBackupsResponseBodyItemsItemMetadataInfo self = new ListBackupsResponseBodyItemsItemMetadataInfo();
            return TeaModel.build(map, self);
        }

        public ListBackupsResponseBodyItemsItemMetadataInfo setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public ListBackupsResponseBodyItemsItemMetadataInfo setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

    }

    public static class ListBackupsResponseBodyItemsItem extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TarFileName")
        public String tarFileName;

        @NameInMap("StorePath")
        public String storePath;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("BackupPlanId")
        public String backupPlanId;

        @NameInMap("MetadataInfo")
        public ListBackupsResponseBodyItemsItemMetadataInfo metadataInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListBackupsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListBackupsResponseBodyItemsItem self = new ListBackupsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListBackupsResponseBodyItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBackupsResponseBodyItemsItem setTarFileName(String tarFileName) {
            this.tarFileName = tarFileName;
            return this;
        }
        public String getTarFileName() {
            return this.tarFileName;
        }

        public ListBackupsResponseBodyItemsItem setStorePath(String storePath) {
            this.storePath = storePath;
            return this;
        }
        public String getStorePath() {
            return this.storePath;
        }

        public ListBackupsResponseBodyItemsItem setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListBackupsResponseBodyItemsItem setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListBackupsResponseBodyItemsItem setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public ListBackupsResponseBodyItemsItem setMetadataInfo(ListBackupsResponseBodyItemsItemMetadataInfo metadataInfo) {
            this.metadataInfo = metadataInfo;
            return this;
        }
        public ListBackupsResponseBodyItemsItemMetadataInfo getMetadataInfo() {
            return this.metadataInfo;
        }

        public ListBackupsResponseBodyItemsItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListBackupsResponseBodyItemsItem setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListBackupsResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListBackupsResponseBodyItemsItem> item;

        public static ListBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListBackupsResponseBodyItems self = new ListBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListBackupsResponseBodyItems setItem(java.util.List<ListBackupsResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListBackupsResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
