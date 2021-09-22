// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionDeploymentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Paginator")
    public ListFunctionDeploymentResponseBodyPaginator paginator;

    @NameInMap("DataList")
    public java.util.List<ListFunctionDeploymentResponseBodyDataList> dataList;

    public static ListFunctionDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionDeploymentResponseBody self = new ListFunctionDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionDeploymentResponseBody setPaginator(ListFunctionDeploymentResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListFunctionDeploymentResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public ListFunctionDeploymentResponseBody setDataList(java.util.List<ListFunctionDeploymentResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListFunctionDeploymentResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public static class ListFunctionDeploymentResponseBodyPaginator extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static ListFunctionDeploymentResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionDeploymentResponseBodyPaginator self = new ListFunctionDeploymentResponseBodyPaginator();
            return TeaModel.build(map, self);
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

        public ListFunctionDeploymentResponseBodyPaginator setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

    public static class ListFunctionDeploymentResponseBodyDataListStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Label")
        public String label;

        public static ListFunctionDeploymentResponseBodyDataListStatus build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionDeploymentResponseBodyDataListStatus self = new ListFunctionDeploymentResponseBodyDataListStatus();
            return TeaModel.build(map, self);
        }

        public ListFunctionDeploymentResponseBodyDataListStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFunctionDeploymentResponseBodyDataListStatus setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ListFunctionDeploymentResponseBodyDataList extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("DownloadSignedUrl")
        public String downloadSignedUrl;

        @NameInMap("VersionNo")
        public String versionNo;

        @NameInMap("ModifiedAt")
        public String modifiedAt;

        @NameInMap("Status")
        public ListFunctionDeploymentResponseBodyDataListStatus status;

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

        public ListFunctionDeploymentResponseBodyDataList setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
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

    }

}
