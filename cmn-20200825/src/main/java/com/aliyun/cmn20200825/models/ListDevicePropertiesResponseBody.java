// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicePropertiesResponseBody extends TeaModel {
    @NameInMap("DeviceProperties")
    public java.util.List<ListDevicePropertiesResponseBodyDeviceProperties> deviceProperties;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDevicePropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicePropertiesResponseBody self = new ListDevicePropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicePropertiesResponseBody setDeviceProperties(java.util.List<ListDevicePropertiesResponseBodyDeviceProperties> deviceProperties) {
        this.deviceProperties = deviceProperties;
        return this;
    }
    public java.util.List<ListDevicePropertiesResponseBodyDeviceProperties> getDeviceProperties() {
        return this.deviceProperties;
    }

    public ListDevicePropertiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevicePropertiesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDevicePropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicePropertiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDevicePropertiesResponseBodyDeviceProperties extends TeaModel {
        @NameInMap("BuiltIn")
        public Boolean builtIn;

        @NameInMap("DeviceFormId")
        public String deviceFormId;

        @NameInMap("DeviceFormName")
        public String deviceFormName;

        @NameInMap("DevicePropertyId")
        public String devicePropertyId;

        @NameInMap("PropertyContent")
        public String propertyContent;

        @NameInMap("PropertyFormat")
        public String propertyFormat;

        @NameInMap("PropertyKey")
        public String propertyKey;

        @NameInMap("PropertyName")
        public String propertyName;

        public static ListDevicePropertiesResponseBodyDeviceProperties build(java.util.Map<String, ?> map) throws Exception {
            ListDevicePropertiesResponseBodyDeviceProperties self = new ListDevicePropertiesResponseBodyDeviceProperties();
            return TeaModel.build(map, self);
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setBuiltIn(Boolean builtIn) {
            this.builtIn = builtIn;
            return this;
        }
        public Boolean getBuiltIn() {
            return this.builtIn;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setDeviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setDeviceFormName(String deviceFormName) {
            this.deviceFormName = deviceFormName;
            return this;
        }
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setDevicePropertyId(String devicePropertyId) {
            this.devicePropertyId = devicePropertyId;
            return this;
        }
        public String getDevicePropertyId() {
            return this.devicePropertyId;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyContent(String propertyContent) {
            this.propertyContent = propertyContent;
            return this;
        }
        public String getPropertyContent() {
            return this.propertyContent;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyFormat(String propertyFormat) {
            this.propertyFormat = propertyFormat;
            return this;
        }
        public String getPropertyFormat() {
            return this.propertyFormat;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

    }

}
