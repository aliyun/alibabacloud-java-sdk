// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The directories.</p>
     */
    @NameInMap("Directories")
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> directories;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F369A091-002F-49C8-AD55-02A77629****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesResponseBody self = new DescribeDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesResponseBody setDirectories(java.util.List<DescribeDirectoriesResponseBodyDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> getDirectories() {
        return this.directories;
    }

    public DescribeDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDirectoriesResponseBodyDirectories extends TeaModel {
        /**
         * <p>The connection method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>VPC: End users connect to cloud computers over an enterprise virtual private cloud (VPC).</li>
         * <li>INTERNET: End users connect to cloud computers over the Internet.</li>
         * <li>ANY: End users connect to cloud computers over the Internet or an enterprise VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>AD_CONNECTOR</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <p>The URL of the SSO service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eds-cn-shanghai-67726">https://eds-cn-shanghai-67726</a>****</p>
         */
        @NameInMap("SsoServiceUrl")
        public String ssoServiceUrl;

        public static DescribeDirectoriesResponseBodyDirectories build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectories self = new DescribeDirectoriesResponseBodyDirectories();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectories setDesktopAccessType(String desktopAccessType) {
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDirectoriesResponseBodyDirectories setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public DescribeDirectoriesResponseBodyDirectories setSsoServiceUrl(String ssoServiceUrl) {
            this.ssoServiceUrl = ssoServiceUrl;
            return this;
        }
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

    }

}
