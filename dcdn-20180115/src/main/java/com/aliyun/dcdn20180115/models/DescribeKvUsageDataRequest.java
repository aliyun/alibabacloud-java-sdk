// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeKvUsageDataRequest extends TeaModel {
    /**
     * <p>The request method. If the parameter is empty, data about all methods is returned. Valid values:</p>
     * <br>
     * <p>*   **get**</p>
     * <p>*   **put**</p>
     * <p>*   **list**</p>
     * <p>*   **delete**</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the request data. Set the value to **acc**.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The namespace ID. If the parameter is empty, data about all namespaces is returned.</p>
     * <br>
     * <p>You can specify a maximum number of 30 namespace IDs and separate them with commas (,).</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The type of the response data. Valid values:</p>
     * <br>
     * <p>*   **detail**: detailed data</p>
     * <p>*   **total**: summary data</p>
     * <br>
     * <p>Default value: **detail**.</p>
     */
    @NameInMap("ResponseType")
    public String responseType;

    /**
     * <p>The key that is used to group data. Valid values: **type** and **namespace**.</p>
     * <br>
     * <p>*   **type**: Data is grouped by time. The data in the last 5 minutes is returned.</p>
     * <p>*   **namespace**: Data is grouped by namespace and is not padded with zeros.</p>
     * <p>*   Default value: **type**.</p>
     * <br>
     * <p>If **ResponseType** is set to **total**, data to return is not grouped by **namespace** but by **type**.</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>The minimum data granularity is 1 hour. If you do not specify this parameter, the data in the last seven days is returned.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeKvUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvUsageDataRequest self = new DescribeKvUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKvUsageDataRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public DescribeKvUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeKvUsageDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeKvUsageDataRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeKvUsageDataRequest setResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }
    public String getResponseType() {
        return this.responseType;
    }

    public DescribeKvUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeKvUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
