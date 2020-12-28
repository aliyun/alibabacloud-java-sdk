// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImageGatewayConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Imagegw")
    public DescribeImageGatewayConfigResponseBodyImagegw imagegw;

    public static DescribeImageGatewayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGatewayConfigResponseBody self = new DescribeImageGatewayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageGatewayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageGatewayConfigResponseBody setImagegw(DescribeImageGatewayConfigResponseBodyImagegw imagegw) {
        this.imagegw = imagegw;
        return this;
    }
    public DescribeImageGatewayConfigResponseBodyImagegw getImagegw() {
        return this.imagegw;
    }

    public static class DescribeImageGatewayConfigResponseBodyImagegwLocations extends TeaModel {
        @NameInMap("RemoteType")
        public String remoteType;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Location")
        public String location;

        @NameInMap("Authentication")
        public String authentication;

        public static DescribeImageGatewayConfigResponseBodyImagegwLocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageGatewayConfigResponseBodyImagegwLocations self = new DescribeImageGatewayConfigResponseBodyImagegwLocations();
            return TeaModel.build(map, self);
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocations setRemoteType(String remoteType) {
            this.remoteType = remoteType;
            return this;
        }
        public String getRemoteType() {
            return this.remoteType;
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocations setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocations setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocations setAuthentication(String authentication) {
            this.authentication = authentication;
            return this;
        }
        public String getAuthentication() {
            return this.authentication;
        }

    }

    public static class DescribeImageGatewayConfigResponseBodyImagegw extends TeaModel {
        @NameInMap("Locations")
        public java.util.List<DescribeImageGatewayConfigResponseBodyImagegwLocations> locations;

        @NameInMap("UpdateDateTime")
        public String updateDateTime;

        @NameInMap("ImageExpirationTimeout")
        public String imageExpirationTimeout;

        @NameInMap("MongoDBURI")
        public String mongoDBURI;

        @NameInMap("DefaultImageLocation")
        public String defaultImageLocation;

        @NameInMap("PullUpdateTimeout")
        public Long pullUpdateTimeout;

        public static DescribeImageGatewayConfigResponseBodyImagegw build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageGatewayConfigResponseBodyImagegw self = new DescribeImageGatewayConfigResponseBodyImagegw();
            return TeaModel.build(map, self);
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setLocations(java.util.List<DescribeImageGatewayConfigResponseBodyImagegwLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<DescribeImageGatewayConfigResponseBodyImagegwLocations> getLocations() {
            return this.locations;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setImageExpirationTimeout(String imageExpirationTimeout) {
            this.imageExpirationTimeout = imageExpirationTimeout;
            return this;
        }
        public String getImageExpirationTimeout() {
            return this.imageExpirationTimeout;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setMongoDBURI(String mongoDBURI) {
            this.mongoDBURI = mongoDBURI;
            return this;
        }
        public String getMongoDBURI() {
            return this.mongoDBURI;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setDefaultImageLocation(String defaultImageLocation) {
            this.defaultImageLocation = defaultImageLocation;
            return this;
        }
        public String getDefaultImageLocation() {
            return this.defaultImageLocation;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setPullUpdateTimeout(Long pullUpdateTimeout) {
            this.pullUpdateTimeout = pullUpdateTimeout;
            return this;
        }
        public Long getPullUpdateTimeout() {
            return this.pullUpdateTimeout;
        }

    }

}
