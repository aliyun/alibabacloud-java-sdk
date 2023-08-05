// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeStaticFileResponseBody extends TeaModel {
    @NameInMap("FileUploadServerInfos")
    public DescribeStaticFileResponseBodyFileUploadServerInfos fileUploadServerInfos;

    public static DescribeStaticFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStaticFileResponseBody self = new DescribeStaticFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStaticFileResponseBody setFileUploadServerInfos(DescribeStaticFileResponseBodyFileUploadServerInfos fileUploadServerInfos) {
        this.fileUploadServerInfos = fileUploadServerInfos;
        return this;
    }
    public DescribeStaticFileResponseBodyFileUploadServerInfos getFileUploadServerInfos() {
        return this.fileUploadServerInfos;
    }

    public static class DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo extends TeaModel {
        @NameInMap("LocalMd5")
        public String localMd5;

        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public String result;

        @NameInMap("ServerIp")
        public String serverIp;

        public static DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo self = new DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo();
            return TeaModel.build(map, self);
        }

        public DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo setLocalMd5(String localMd5) {
            this.localMd5 = localMd5;
            return this;
        }
        public String getLocalMd5() {
            return this.localMd5;
        }

        public DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

    }

    public static class DescribeStaticFileResponseBodyFileUploadServerInfos extends TeaModel {
        @NameInMap("FileUploadServerInfo")
        public java.util.List<DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo> fileUploadServerInfo;

        public static DescribeStaticFileResponseBodyFileUploadServerInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeStaticFileResponseBodyFileUploadServerInfos self = new DescribeStaticFileResponseBodyFileUploadServerInfos();
            return TeaModel.build(map, self);
        }

        public DescribeStaticFileResponseBodyFileUploadServerInfos setFileUploadServerInfo(java.util.List<DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo> fileUploadServerInfo) {
            this.fileUploadServerInfo = fileUploadServerInfo;
            return this;
        }
        public java.util.List<DescribeStaticFileResponseBodyFileUploadServerInfosFileUploadServerInfo> getFileUploadServerInfo() {
            return this.fileUploadServerInfo;
        }

    }

}
