// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAvailableAlertGroupsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static ListCloudGtmAvailableAlertGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAvailableAlertGroupsRequest self = new ListCloudGtmAvailableAlertGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAvailableAlertGroupsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
