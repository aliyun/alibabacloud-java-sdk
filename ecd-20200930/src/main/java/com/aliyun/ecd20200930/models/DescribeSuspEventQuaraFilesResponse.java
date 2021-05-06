// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("QuaraFiles")
    @Validation(required = true)
    public java.util.List<DescribeSuspEventQuaraFilesResponseQuaraFiles> quaraFiles;

    public static DescribeSuspEventQuaraFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesResponse self = new DescribeSuspEventQuaraFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventQuaraFilesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventQuaraFilesResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventQuaraFilesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSuspEventQuaraFilesResponse setQuaraFiles(java.util.List<DescribeSuspEventQuaraFilesResponseQuaraFiles> quaraFiles) {
        this.quaraFiles = quaraFiles;
        return this;
    }
    public java.util.List<DescribeSuspEventQuaraFilesResponseQuaraFiles> getQuaraFiles() {
        return this.quaraFiles;
    }

    public static class DescribeSuspEventQuaraFilesResponseQuaraFiles extends TeaModel {
        @NameInMap("EventName")
        @Validation(required = true)
        public String eventName;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("DesktopName")
        @Validation(required = true)
        public String desktopName;

        @NameInMap("Md5")
        @Validation(required = true)
        public String md5;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        public static DescribeSuspEventQuaraFilesResponseQuaraFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventQuaraFilesResponseQuaraFiles self = new DescribeSuspEventQuaraFilesResponseQuaraFiles();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSuspEventQuaraFilesResponseQuaraFiles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
