// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySpeechBroadcastHourRequest extends TeaModel {
    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~) of IoT instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 2000.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of **PageToken**.</p>
     * <br>
     * <p>For example, if you want to query the results on Page n, you must set PageToken to the token that you obtained when you queried the results on Page n - 1.</p>
     */
    @NameInMap("PageToken")
    public String pageToken;

    /**
     * <p>The end time of the hour in which you want to query data. Example: 2020090919, which specifies 19:00 on September 9, 2020.</p>
     */
    @NameInMap("QueryDateTimeHour")
    public String queryDateTimeHour;

    /**
     * <p>The code of the speech sharing task.</p>
     * <br>
     * <p>You can obtain the **code** on the **Shared Corpus Management** page of **Speech Sending Voice Broadcasting Service**.</p>
     */
    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    public static PageQuerySpeechBroadcastHourRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQuerySpeechBroadcastHourRequest self = new PageQuerySpeechBroadcastHourRequest();
        return TeaModel.build(map, self);
    }

    public PageQuerySpeechBroadcastHourRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PageQuerySpeechBroadcastHourRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQuerySpeechBroadcastHourRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public PageQuerySpeechBroadcastHourRequest setQueryDateTimeHour(String queryDateTimeHour) {
        this.queryDateTimeHour = queryDateTimeHour;
        return this;
    }
    public String getQueryDateTimeHour() {
        return this.queryDateTimeHour;
    }

    public PageQuerySpeechBroadcastHourRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

}
