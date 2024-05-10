// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTableDataByFormInstanceIdTableIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormInstanceId")
    public String formInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableFieldId")
    public String tableFieldId;

    public static ListTableDataByFormInstanceIdTableIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableDataByFormInstanceIdTableIdRequest self = new ListTableDataByFormInstanceIdTableIdRequest();
        return TeaModel.build(map, self);
    }

    public ListTableDataByFormInstanceIdTableIdRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListTableDataByFormInstanceIdTableIdRequest setFormInstanceId(String formInstanceId) {
        this.formInstanceId = formInstanceId;
        return this;
    }
    public String getFormInstanceId() {
        return this.formInstanceId;
    }

    public ListTableDataByFormInstanceIdTableIdRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public ListTableDataByFormInstanceIdTableIdRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTableDataByFormInstanceIdTableIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTableDataByFormInstanceIdTableIdRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public ListTableDataByFormInstanceIdTableIdRequest setTableFieldId(String tableFieldId) {
        this.tableFieldId = tableFieldId;
        return this;
    }
    public String getTableFieldId() {
        return this.tableFieldId;
    }

}
