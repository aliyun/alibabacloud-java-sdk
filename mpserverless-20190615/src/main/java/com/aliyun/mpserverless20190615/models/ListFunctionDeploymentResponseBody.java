// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionDeploymentResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListFunctionDeploymentResponseBodyDataList> dataList;

    @NameInMap("Paginator")
    public ListFunctionDeploymentResponseBodyPaginator paginator;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFunctionDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionDeploymentResponseBody self = new ListFunctionDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionDeploymentResponseBody setDataList(java.util.List<ListFunctionDeploymentResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListFunctionDeploymentResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListFunctionDeploymentResponseBody setPaginator(ListFunctionDeploymentResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListFunctionDeploymentResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public ListFunctionDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFunctionDeploymentResponseBodyDataListStatus extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Status")
        public String status;

        public static ListFunctionDeploymentResponseBodyDataListStatus build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionDeploymentResponseBodyDataListStatus self = new ListFunctionDeploymentResponseBodyDataListStatus();
            return TeaModel.build(map, self);
        }

        public ListFunctionDeploymentResponseBodyDataListStatus setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListFunctionDeploymentResponseBodyDataListStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListFunctionDeploymentResponseBodyDataList extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("DownloadSignedUrl")
        public String downloadSignedUrl;

        @NameInMap("ModifiedAt")
        public String modifiedAt;

        @NameInMap("Status")
        public ListFunctionDeploymentResponseBodyDataListStatus status;

        @NameInMap("VersionNo")
        public String versionNo;

        public static ListFunctionDeploymentResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionDeploymentResponseBodyDataList self = new ListFunctionDeploymentResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFunctionDeploymentResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListFunctionDeploymentResponseBodyDataList setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public ListFunctionDeploymentResponseBodyDataList setDownloadSignedUrl(String downloadSignedUrl) {
            this.downloadSignedUrl = downloadSignedUrl;
            return this;
        }
        public String getDownloadSignedUrl() {
            return this.downloadSignedUrl;
        }

        public ListFunctionDeploymentResponseBodyDataList setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public ListFunctionDeploymentResponseBodyDataList setStatus(ListFunctionDeploymentResponseBodyDataListStatus status) {
            this.status = status;
            return this;
        }
        public ListFunctionDeploymentResponseBodyDataListStatus getStatus() {
            return this.status;
        }

        public ListFunctionDeploymentResponseBodyDataList setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

    }

    public static class ListFunctionDeploymentResponseBodyPaginator extends TeaModel {
        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListFunctionDeploymentResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionDeploymentResponseBodyPaginator self = new ListFunctionDeploymentResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ListFunctionDeploymentResponseBodyPaginator setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListFunctionDeploymentResponseBodyPaginator setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFunctionDeploymentResponseBodyPaginator setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFunctionDeploymentResponseBodyPaginator setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
