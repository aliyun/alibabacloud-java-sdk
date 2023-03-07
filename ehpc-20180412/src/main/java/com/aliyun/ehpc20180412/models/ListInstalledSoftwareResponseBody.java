// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInstalledSoftwareResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of installed software.</p>
     */
    @NameInMap("SoftwareList")
    public ListInstalledSoftwareResponseBodySoftwareList softwareList;

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

    public ListInstalledSoftwareResponseBody setSoftwareList(ListInstalledSoftwareResponseBodySoftwareList softwareList) {
        this.softwareList = softwareList;
        return this;
    }
    public ListInstalledSoftwareResponseBodySoftwareList getSoftwareList() {
        return this.softwareList;
    }

    public static class ListInstalledSoftwareResponseBodySoftwareListSoftwareList extends TeaModel {
        /**
         * <p>The ID of the software.</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The name of the software.</p>
         */
        @NameInMap("SoftwareName")
        public String softwareName;

        /**
         * <p>The status of the software. Valid values:</p>
         * <br>
         * <p>*   Installing: The software is being installed.</p>
         * <p>*   Installed: The software is installed.</p>
         */
        @NameInMap("SoftwareStatus")
        public String softwareStatus;

        /**
         * <p>The version of the software.</p>
         */
        @NameInMap("SoftwareVersion")
        public String softwareVersion;

        public static ListInstalledSoftwareResponseBodySoftwareListSoftwareList build(java.util.Map<String, ?> map) throws Exception {
            ListInstalledSoftwareResponseBodySoftwareListSoftwareList self = new ListInstalledSoftwareResponseBodySoftwareListSoftwareList();
            return TeaModel.build(map, self);
        }

        public ListInstalledSoftwareResponseBodySoftwareListSoftwareList setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public ListInstalledSoftwareResponseBodySoftwareListSoftwareList setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
            return this;
        }
        public String getSoftwareName() {
            return this.softwareName;
        }

        public ListInstalledSoftwareResponseBodySoftwareListSoftwareList setSoftwareStatus(String softwareStatus) {
            this.softwareStatus = softwareStatus;
            return this;
        }
        public String getSoftwareStatus() {
            return this.softwareStatus;
        }

        public ListInstalledSoftwareResponseBodySoftwareListSoftwareList setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

    }

    public static class ListInstalledSoftwareResponseBodySoftwareList extends TeaModel {
        @NameInMap("SoftwareList")
        public java.util.List<ListInstalledSoftwareResponseBodySoftwareListSoftwareList> softwareList;

        public static ListInstalledSoftwareResponseBodySoftwareList build(java.util.Map<String, ?> map) throws Exception {
            ListInstalledSoftwareResponseBodySoftwareList self = new ListInstalledSoftwareResponseBodySoftwareList();
            return TeaModel.build(map, self);
        }

        public ListInstalledSoftwareResponseBodySoftwareList setSoftwareList(java.util.List<ListInstalledSoftwareResponseBodySoftwareListSoftwareList> softwareList) {
            this.softwareList = softwareList;
            return this;
        }
        public java.util.List<ListInstalledSoftwareResponseBodySoftwareListSoftwareList> getSoftwareList() {
            return this.softwareList;
        }

    }

}
