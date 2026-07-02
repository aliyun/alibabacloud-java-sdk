// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class GetDetailByOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Acceptor")
    public String acceptor;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizNo")
    public String bizNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Channel")
    public String channel;

    @NameInMap("CheckAuthItems")
    public String checkAuthItems;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OptSource")
    public String optSource;

    public static GetDetailByOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetailByOrderRequest self = new GetDetailByOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetDetailByOrderRequest setAcceptor(String acceptor) {
        this.acceptor = acceptor;
        return this;
    }
    public String getAcceptor() {
        return this.acceptor;
    }

    public GetDetailByOrderRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public GetDetailByOrderRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetDetailByOrderRequest setCheckAuthItems(String checkAuthItems) {
        this.checkAuthItems = checkAuthItems;
        return this;
    }
    public String getCheckAuthItems() {
        return this.checkAuthItems;
    }

    public GetDetailByOrderRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public GetDetailByOrderRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetDetailByOrderRequest setOptSource(String optSource) {
        this.optSource = optSource;
        return this;
    }
    public String getOptSource() {
        return this.optSource;
    }

}
