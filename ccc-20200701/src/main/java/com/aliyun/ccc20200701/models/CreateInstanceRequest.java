// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;24861380681070****&quot;,&quot;105980354482****&quot;]</p>
     */
    @NameInMap("AdminRamIdList")
    public String adminRamIdList;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
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
