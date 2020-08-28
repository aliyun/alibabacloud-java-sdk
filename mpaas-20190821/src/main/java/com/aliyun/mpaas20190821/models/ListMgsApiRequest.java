// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMgsApiRequest extends TeaModel {
    @NameInMap("ApiStatus")
    public String apiStatus;

    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Format")
    public String format;

    @NameInMap("Host")
    public String host;

    @NameInMap("NeedEncrypt")
    public String needEncrypt;

    @NameInMap("NeedEtag")
    public String needEtag;

    @NameInMap("NeedSign")
    public String needSign;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OptFuzzy")
    public String optFuzzy;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SysId")
    public Long sysId;

    @NameInMap("SysName")
    public String sysName;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMgsApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMgsApiRequest self = new ListMgsApiRequest();
        return TeaModel.build(map, self);
    }

}
