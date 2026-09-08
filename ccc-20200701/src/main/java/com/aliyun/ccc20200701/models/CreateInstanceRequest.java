// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>List of RAM IDs to be assigned as administrators of this Cloud Contact Center instance. After successful creation, the RAM IDs in this list will be automatically imported into the newly created instance with administrator privileges.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;24861380681070****&quot;,&quot;105980354482****&quot;]</p>
     */
    @NameInMap("AdminRamIdList")
    public String adminRamIdList;

    /**
     * <p>Description of the instance. The length must not exceed 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>云联络中心的测试实例。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Second-level domain name of the Cloud Contact Center instance, which serves as the instance ID and is globally unique. It must be 4 to 48 characters long and can only contain uppercase and lowercase English letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Instance name. The length must be between 4 and 32 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试实例</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>List of phone numbers for the Cloud Contact Center instance to be created. The current account must have usage rights to these numbers, and the numbers must not be associated with any other instance.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;0830011xxxx&quot;, &quot;0830312xxxx&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAdminRamIdList(String adminRamIdList) {
        this.adminRamIdList = adminRamIdList;
        return this;
    }
    public String getAdminRamIdList() {
        return this.adminRamIdList;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInstanceRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

}
