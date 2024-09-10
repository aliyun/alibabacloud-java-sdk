// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactGroupRequest extends TeaModel {
    /**
     * <p>The name of the alert contact group.</p>
     * <p>For information about how to obtain the name of an alert contact group, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    /**
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("ContactNames")
    public java.util.List<String> contactNames;

    /**
     * <p>The description of the alert contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Alert_Group</p>
     */
    @NameInMap("Describe")
    public String describe;

    /**
     * <p>Specifies whether to enable the weekly report subscription feature. Valid values:</p>
     * <ul>
     * <li>true: The weekly report subscription feature is enabled.</li>
     * <li>false: The weekly report subscription feature is disabled.</li>
     * </ul>
     * <blockquote>
     * <p> You can enable the weekly report subscription only for an Alibaba Cloud account that has at least five Elastic Compute Service (ECS) instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
