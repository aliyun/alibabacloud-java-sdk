// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAdWorkspaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAdWorkspaceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAdWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdWorkspaceResponseBody self = new ListAdWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAdWorkspaceResponseBody setData(java.util.List<ListAdWorkspaceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAdWorkspaceResponseBodyData> getData() {
        return this.data;
    }

    public ListAdWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAdWorkspaceResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAdWorkspaceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAdWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdWorkspaceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAdWorkspaceResponseBodyData extends TeaModel {
        @NameInMap("AdDomain")
        public String adDomain;

        @NameInMap("AdName")
        public String adName;

        @NameInMap("AdRegionId")
        public String adRegionId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListAdWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAdWorkspaceResponseBodyData self = new ListAdWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAdWorkspaceResponseBodyData setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public ListAdWorkspaceResponseBodyData setAdName(String adName) {
            this.adName = adName;
            return this;
        }
        public String getAdName() {
            return this.adName;
        }

        public ListAdWorkspaceResponseBodyData setAdRegionId(String adRegionId) {
            this.adRegionId = adRegionId;
            return this;
        }
        public String getAdRegionId() {
            return this.adRegionId;
        }

        public ListAdWorkspaceResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
