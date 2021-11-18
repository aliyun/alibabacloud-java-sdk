// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("AdminRamId")
    public java.util.List<String> adminRamId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Name")
    public String name;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("PhoneNumbers")
    public java.util.List<String> phoneNumbers;

    @NameInMap("StorageMaxDays")
    public Integer storageMaxDays;

    @NameInMap("StorageMaxSize")
    public Integer storageMaxSize;

    @NameInMap("UserObject")
    public java.util.List<String> userObject;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAdminRamId(java.util.List<String> adminRamId) {
        this.adminRamId = adminRamId;
        return this;
    }
    public java.util.List<String> getAdminRamId() {
        return this.adminRamId;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
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

    public CreateInstanceRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateInstanceRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public CreateInstanceRequest setStorageMaxDays(Integer storageMaxDays) {
        this.storageMaxDays = storageMaxDays;
        return this;
    }
    public Integer getStorageMaxDays() {
        return this.storageMaxDays;
    }

    public CreateInstanceRequest setStorageMaxSize(Integer storageMaxSize) {
        this.storageMaxSize = storageMaxSize;
        return this;
    }
    public Integer getStorageMaxSize() {
        return this.storageMaxSize;
    }

    public CreateInstanceRequest setUserObject(java.util.List<String> userObject) {
        this.userObject = userObject;
        return this;
    }
    public java.util.List<String> getUserObject() {
        return this.userObject;
    }

}
