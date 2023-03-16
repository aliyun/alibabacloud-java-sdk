// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImageGatewayConfigResponseBody extends TeaModel {
    /**
     * <p>The information about the image gateway configuration file.</p>
     */
    @NameInMap("Imagegw")
    public DescribeImageGatewayConfigResponseBodyImagegw imagegw;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageGatewayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGatewayConfigResponseBody self = new DescribeImageGatewayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageGatewayConfigResponseBody setImagegw(DescribeImageGatewayConfigResponseBodyImagegw imagegw) {
        this.imagegw = imagegw;
        return this;
    }
    public DescribeImageGatewayConfigResponseBodyImagegw getImagegw() {
        return this.imagegw;
    }

    public DescribeImageGatewayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo extends TeaModel {
        /**
         * <p>The authentication method of the image repository. Valid values:</p>
         * <br>
         * <p>*   http</p>
         * <p>*   https</p>
         */
        @NameInMap("Authentication")
        public String authentication;

        /**
         * <p>The source address of the image repository.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The type of the image repository.</p>
         */
        @NameInMap("RemoteType")
        public String remoteType;

        /**
         * <p>The URL of the image repository.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo self = new DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo setAuthentication(String authentication) {
            this.authentication = authentication;
            return this;
        }
        public String getAuthentication() {
            return this.authentication;
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo setRemoteType(String remoteType) {
            this.remoteType = remoteType;
            return this;
        }
        public String getRemoteType() {
            return this.remoteType;
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class DescribeImageGatewayConfigResponseBodyImagegwLocations extends TeaModel {
        @NameInMap("LocationInfo")
        public java.util.List<DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo> locationInfo;

        public static DescribeImageGatewayConfigResponseBodyImagegwLocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageGatewayConfigResponseBodyImagegwLocations self = new DescribeImageGatewayConfigResponseBodyImagegwLocations();
            return TeaModel.build(map, self);
        }

        public DescribeImageGatewayConfigResponseBodyImagegwLocations setLocationInfo(java.util.List<DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo> locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }
        public java.util.List<DescribeImageGatewayConfigResponseBodyImagegwLocationsLocationInfo> getLocationInfo() {
            return this.locationInfo;
        }

    }

    public static class DescribeImageGatewayConfigResponseBodyImagegw extends TeaModel {
        /**
         * <p>The default address of the image repository.</p>
         */
        @NameInMap("DefaultImageLocation")
        public String defaultImageLocation;

        /**
         * <p>The time when the image expires.</p>
         */
        @NameInMap("ImageExpirationTimeout")
        public String imageExpirationTimeout;

        /**
         * <p>An array of the image repository addresses.</p>
         */
        @NameInMap("Locations")
        public DescribeImageGatewayConfigResponseBodyImagegwLocations locations;

        /**
         * <p>The information about the image gateway database.</p>
         */
        @NameInMap("MongoDBURI")
        public String mongoDBURI;

        /**
         * <p>The timeout period for pulling images.</p>
         */
        @NameInMap("PullUpdateTimeout")
        public Long pullUpdateTimeout;

        /**
         * <p>The time when the file was updated.</p>
         */
        @NameInMap("UpdateDateTime")
        public String updateDateTime;

        public static DescribeImageGatewayConfigResponseBodyImagegw build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageGatewayConfigResponseBodyImagegw self = new DescribeImageGatewayConfigResponseBodyImagegw();
            return TeaModel.build(map, self);
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setDefaultImageLocation(String defaultImageLocation) {
            this.defaultImageLocation = defaultImageLocation;
            return this;
        }
        public String getDefaultImageLocation() {
            return this.defaultImageLocation;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setImageExpirationTimeout(String imageExpirationTimeout) {
            this.imageExpirationTimeout = imageExpirationTimeout;
            return this;
        }
        public String getImageExpirationTimeout() {
            return this.imageExpirationTimeout;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setLocations(DescribeImageGatewayConfigResponseBodyImagegwLocations locations) {
            this.locations = locations;
            return this;
        }
        public DescribeImageGatewayConfigResponseBodyImagegwLocations getLocations() {
            return this.locations;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setMongoDBURI(String mongoDBURI) {
            this.mongoDBURI = mongoDBURI;
            return this;
        }
        public String getMongoDBURI() {
            return this.mongoDBURI;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setPullUpdateTimeout(Long pullUpdateTimeout) {
            this.pullUpdateTimeout = pullUpdateTimeout;
            return this;
        }
        public Long getPullUpdateTimeout() {
            return this.pullUpdateTimeout;
        }

        public DescribeImageGatewayConfigResponseBodyImagegw setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

}
