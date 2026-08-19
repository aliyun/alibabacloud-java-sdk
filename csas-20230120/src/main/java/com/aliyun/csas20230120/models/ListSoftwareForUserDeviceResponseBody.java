// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSoftwareForUserDeviceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of software installed on the endpoint device.</p>
     */
    @NameInMap("Software")
    public java.util.List<ListSoftwareForUserDeviceResponseBodySoftware> software;

    /**
     * <p>The total number of software installed on the endpoint device.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListSoftwareForUserDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwareForUserDeviceResponseBody self = new ListSoftwareForUserDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSoftwareForUserDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSoftwareForUserDeviceResponseBody setSoftware(java.util.List<ListSoftwareForUserDeviceResponseBodySoftware> software) {
        this.software = software;
        return this;
    }
    public java.util.List<ListSoftwareForUserDeviceResponseBodySoftware> getSoftware() {
        return this.software;
    }

    public ListSoftwareForUserDeviceResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListSoftwareForUserDeviceResponseBodySoftware extends TeaModel {
        /**
         * <p>The software publisher.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba (China) Network Technology Co.,Ltd.</p>
         */
        @NameInMap("Inc")
        public String inc;

        /**
         * <p>The software installation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-18 02:43:02</p>
         */
        @NameInMap("InstallTime")
        public String installTime;

        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The collection of software versions.</p>
         */
        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static ListSoftwareForUserDeviceResponseBodySoftware build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwareForUserDeviceResponseBodySoftware self = new ListSoftwareForUserDeviceResponseBodySoftware();
            return TeaModel.build(map, self);
        }

        public ListSoftwareForUserDeviceResponseBodySoftware setInc(String inc) {
            this.inc = inc;
            return this;
        }
        public String getInc() {
            return this.inc;
        }

        public ListSoftwareForUserDeviceResponseBodySoftware setInstallTime(String installTime) {
            this.installTime = installTime;
            return this;
        }
        public String getInstallTime() {
            return this.installTime;
        }

        public ListSoftwareForUserDeviceResponseBodySoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSoftwareForUserDeviceResponseBodySoftware setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

}
