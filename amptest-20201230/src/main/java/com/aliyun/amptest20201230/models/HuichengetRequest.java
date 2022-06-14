// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengetRequest extends TeaModel {
    @NameInMap("Add")
    public String add;

    @NameInMap("Address")
    public String address;

    @NameInMap("Apple")
    public String apple;

    @NameInMap("NewName")
    public String newName;

    @NameInMap("Tea")
    public String tea;

    @NameInMap("Three")
    public String three;

    @NameInMap("Two")
    public String two;

    public static HuichengetRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengetRequest self = new HuichengetRequest();
        return TeaModel.build(map, self);
    }

    public HuichengetRequest setAdd(String add) {
        this.add = add;
        return this;
    }
    public String getAdd() {
        return this.add;
    }

    public HuichengetRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public HuichengetRequest setApple(String apple) {
        this.apple = apple;
        return this;
    }
    public String getApple() {
        return this.apple;
    }

    public HuichengetRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public HuichengetRequest setTea(String tea) {
        this.tea = tea;
        return this;
    }
    public String getTea() {
        return this.tea;
    }

    public HuichengetRequest setThree(String three) {
        this.three = three;
        return this;
    }
    public String getThree() {
        return this.three;
    }

    public HuichengetRequest setTwo(String two) {
        this.two = two;
        return this;
    }
    public String getTwo() {
        return this.two;
    }

}
