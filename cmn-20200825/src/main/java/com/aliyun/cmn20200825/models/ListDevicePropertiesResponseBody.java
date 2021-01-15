// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicePropertiesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("DeviceProperties")
    public java.util.List<ListDevicePropertiesResponseBodyDeviceProperties> deviceProperties;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 每页数量。
    @NameInMap("MaxResults")
    public Integer maxResults;

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

    public ListDevicePropertiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListDevicePropertiesResponseBodyDeviceProperties extends TeaModel {
        // 设备属性ID
        @NameInMap("DevicePropertyId")
        public String devicePropertyId;

        // 设备形态ID
        @NameInMap("DeviceFormId")
        public String deviceFormId;

        // 设备形态名称
        @NameInMap("DeviceFormName")
        public String deviceFormName;

        // 属性名称
        @NameInMap("PropertyName")
        public String propertyName;

        // 属性主键
        @NameInMap("PropertyKey")
        public String propertyKey;

        // 属性格式
        @NameInMap("PropertyFormat")
        public String propertyFormat;

        // 属性内容
        @NameInMap("PropertyContent")
        public String propertyContent;

        // 是否内置属性
        @NameInMap("BuiltIn")
        public Boolean builtIn;

        public static ListDevicePropertiesResponseBodyDeviceProperties build(java.util.Map<String, ?> map) throws Exception {
            ListDevicePropertiesResponseBodyDeviceProperties self = new ListDevicePropertiesResponseBodyDeviceProperties();
            return TeaModel.build(map, self);
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setDevicePropertyId(String devicePropertyId) {
            this.devicePropertyId = devicePropertyId;
            return this;
        }
        public String getDevicePropertyId() {
            return this.devicePropertyId;
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

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyFormat(String propertyFormat) {
            this.propertyFormat = propertyFormat;
            return this;
        }
        public String getPropertyFormat() {
            return this.propertyFormat;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setPropertyContent(String propertyContent) {
            this.propertyContent = propertyContent;
            return this;
        }
        public String getPropertyContent() {
            return this.propertyContent;
        }

        public ListDevicePropertiesResponseBodyDeviceProperties setBuiltIn(Boolean builtIn) {
            this.builtIn = builtIn;
            return this;
        }
        public Boolean getBuiltIn() {
            return this.builtIn;
        }

    }

}
