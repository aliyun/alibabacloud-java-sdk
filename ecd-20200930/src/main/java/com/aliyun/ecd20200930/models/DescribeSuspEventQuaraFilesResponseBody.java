// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("QuaraFiles")
    public java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> quaraFiles;

    public static DescribeSuspEventQuaraFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesResponseBody self = new DescribeSuspEventQuaraFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventQuaraFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventQuaraFilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventQuaraFilesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSuspEventQuaraFilesResponseBody setQuaraFiles(java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> quaraFiles) {
        this.quaraFiles = quaraFiles;
        return this;
    }
    public java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> getQuaraFiles() {
        return this.quaraFiles;
    }

    public static class DescribeSuspEventQuaraFilesResponseBodyQuaraFiles extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Path")
        public String path;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static DescribeSuspEventQuaraFilesResponseBodyQuaraFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventQuaraFilesResponseBodyQuaraFiles self = new DescribeSuspEventQuaraFilesResponseBodyQuaraFiles();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
