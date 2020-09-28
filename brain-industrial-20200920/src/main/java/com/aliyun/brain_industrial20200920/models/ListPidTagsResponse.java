// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PidTagList")
    @Validation(required = true)
    public java.util.List<ListPidTagsResponsePidTagList> pidTagList;

    public static ListPidTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPidTagsResponse self = new ListPidTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListPidTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPidTagsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPidTagsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPidTagsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPidTagsResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPidTagsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPidTagsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPidTagsResponse setPidTagList(java.util.List<ListPidTagsResponsePidTagList> pidTagList) {
        this.pidTagList = pidTagList;
        return this;
    }
    public java.util.List<ListPidTagsResponsePidTagList> getPidTagList() {
        return this.pidTagList;
    }

    public static class ListPidTagsResponsePidTagList extends TeaModel {
        @NameInMap("PidTagId")
        @Validation(required = true)
        public String pidTagId;

        @NameInMap("PidProjectId")
        @Validation(required = true)
        public String pidProjectId;

        @NameInMap("PidTagName")
        @Validation(required = true)
        public String pidTagName;

        @NameInMap("PidTagType")
        @Validation(required = true)
        public String pidTagType;

        @NameInMap("UploadProjectId")
        @Validation(required = true)
        public Long uploadProjectId;

        public static ListPidTagsResponsePidTagList build(java.util.Map<String, ?> map) throws Exception {
            ListPidTagsResponsePidTagList self = new ListPidTagsResponsePidTagList();
            return TeaModel.build(map, self);
        }

        public ListPidTagsResponsePidTagList setPidTagId(String pidTagId) {
            this.pidTagId = pidTagId;
            return this;
        }
        public String getPidTagId() {
            return this.pidTagId;
        }

        public ListPidTagsResponsePidTagList setPidProjectId(String pidProjectId) {
            this.pidProjectId = pidProjectId;
            return this;
        }
        public String getPidProjectId() {
            return this.pidProjectId;
        }

        public ListPidTagsResponsePidTagList setPidTagName(String pidTagName) {
            this.pidTagName = pidTagName;
            return this;
        }
        public String getPidTagName() {
            return this.pidTagName;
        }

        public ListPidTagsResponsePidTagList setPidTagType(String pidTagType) {
            this.pidTagType = pidTagType;
            return this;
        }
        public String getPidTagType() {
            return this.pidTagType;
        }

        public ListPidTagsResponsePidTagList setUploadProjectId(Long uploadProjectId) {
            this.uploadProjectId = uploadProjectId;
            return this;
        }
        public Long getUploadProjectId() {
            return this.uploadProjectId;
        }

    }

}
