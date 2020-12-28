// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInstalledSoftwareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SoftwareList")
    public java.util.List<ListInstalledSoftwareResponseBodySoftwareList> softwareList;

    public static ListInstalledSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstalledSoftwareResponseBody self = new ListInstalledSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstalledSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstalledSoftwareResponseBody setSoftwareList(java.util.List<ListInstalledSoftwareResponseBodySoftwareList> softwareList) {
        this.softwareList = softwareList;
        return this;
    }
    public java.util.List<ListInstalledSoftwareResponseBodySoftwareList> getSoftwareList() {
        return this.softwareList;
    }

    public static class ListInstalledSoftwareResponseBodySoftwareList extends TeaModel {
        @NameInMap("SoftwareVersion")
        public String softwareVersion;

        @NameInMap("SoftwareName")
        public String softwareName;

        @NameInMap("SoftwareId")
        public String softwareId;

        @NameInMap("SoftwareStatus")
        public String softwareStatus;

        public static ListInstalledSoftwareResponseBodySoftwareList build(java.util.Map<String, ?> map) throws Exception {
            ListInstalledSoftwareResponseBodySoftwareList self = new ListInstalledSoftwareResponseBodySoftwareList();
            return TeaModel.build(map, self);
        }

        public ListInstalledSoftwareResponseBodySoftwareList setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        public ListInstalledSoftwareResponseBodySoftwareList setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
            return this;
        }
        public String getSoftwareName() {
            return this.softwareName;
        }

        public ListInstalledSoftwareResponseBodySoftwareList setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public ListInstalledSoftwareResponseBodySoftwareList setSoftwareStatus(String softwareStatus) {
            this.softwareStatus = softwareStatus;
            return this;
        }
        public String getSoftwareStatus() {
            return this.softwareStatus;
        }

    }

}
