// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelCredentialsResponseBody extends TeaModel {
    @NameInMap("IngestEndpoints")
    public java.util.List<UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints> ingestEndpoints;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLivePackageChannelCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelCredentialsResponseBody self = new UpdateLivePackageChannelCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelCredentialsResponseBody setIngestEndpoints(java.util.List<UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints> ingestEndpoints) {
        this.ingestEndpoints = ingestEndpoints;
        return this;
    }
    public java.util.List<UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints> getIngestEndpoints() {
        return this.ingestEndpoints;
    }

    public UpdateLivePackageChannelCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>input1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>examplePassword123</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/input1</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Username")
        public String username;

        public static UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints self = new UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints();
            return TeaModel.build(map, self);
        }

        public UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLivePackageChannelCredentialsResponseBodyIngestEndpoints setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
