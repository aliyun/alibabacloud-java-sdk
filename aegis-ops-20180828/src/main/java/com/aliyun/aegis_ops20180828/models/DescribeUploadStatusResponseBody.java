// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeUploadStatusResponseBody extends TeaModel {
    @NameInMap("FileUploadServerInfos")
    public DescribeUploadStatusResponseBodyFileUploadServerInfos fileUploadServerInfos;

    public static DescribeUploadStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadStatusResponseBody self = new DescribeUploadStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUploadStatusResponseBody setFileUploadServerInfos(DescribeUploadStatusResponseBodyFileUploadServerInfos fileUploadServerInfos) {
        this.fileUploadServerInfos = fileUploadServerInfos;
        return this;
    }
    public DescribeUploadStatusResponseBodyFileUploadServerInfos getFileUploadServerInfos() {
        return this.fileUploadServerInfos;
    }

    public static class DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo extends TeaModel {
        @NameInMap("LocalMd5")
        public String localMd5;

        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public String result;

        @NameInMap("ServerIp")
        public String serverIp;

        public static DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo self = new DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo setLocalMd5(String localMd5) {
            this.localMd5 = localMd5;
            return this;
        }
        public String getLocalMd5() {
            return this.localMd5;
        }

        public DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

    }

    public static class DescribeUploadStatusResponseBodyFileUploadServerInfos extends TeaModel {
        @NameInMap("FileUploadServerInfo")
        public java.util.List<DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo> fileUploadServerInfo;

        public static DescribeUploadStatusResponseBodyFileUploadServerInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUploadStatusResponseBodyFileUploadServerInfos self = new DescribeUploadStatusResponseBodyFileUploadServerInfos();
            return TeaModel.build(map, self);
        }

        public DescribeUploadStatusResponseBodyFileUploadServerInfos setFileUploadServerInfo(java.util.List<DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo> fileUploadServerInfo) {
            this.fileUploadServerInfo = fileUploadServerInfo;
            return this;
        }
        public java.util.List<DescribeUploadStatusResponseBodyFileUploadServerInfosFileUploadServerInfo> getFileUploadServerInfo() {
            return this.fileUploadServerInfo;
        }

    }

}
