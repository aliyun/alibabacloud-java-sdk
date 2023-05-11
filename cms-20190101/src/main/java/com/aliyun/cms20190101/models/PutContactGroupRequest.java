// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactGroupRequest extends TeaModel {
    /**
     * <p>The description of the alert contact group.</p>
     */
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("ContactNames")
    public java.util.List<String> contactNames;

    /**
     * <p>Specifies whether to enable the weekly report subscription feature. Valid values:</p>
     * <br>
     * <p>*   true: The weekly report subscription feature is enabled.</p>
     * <p>*   false: The weekly report subscription feature is disabled.</p>
     * <br>
     * <p>>  You can enable the weekly report subscription only for an Alibaba Cloud account that has at least five Elastic Compute Service (ECS) instances.</p>
     */
    @NameInMap("Describe")
    public String describe;

    /**
     * <p>The name of the alert contact. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("EnableSubscribed")
    public Boolean enableSubscribed;

    public static PutContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        PutContactGroupRequest self = new PutContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public PutContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public PutContactGroupRequest setContactNames(java.util.List<String> contactNames) {
        this.contactNames = contactNames;
        return this;
    }
    public java.util.List<String> getContactNames() {
        return this.contactNames;
    }

    public PutContactGroupRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public PutContactGroupRequest setEnableSubscribed(Boolean enableSubscribed) {
        this.enableSubscribed = enableSubscribed;
        return this;
    }
    public Boolean getEnableSubscribed() {
        return this.enableSubscribed;
    }

}
