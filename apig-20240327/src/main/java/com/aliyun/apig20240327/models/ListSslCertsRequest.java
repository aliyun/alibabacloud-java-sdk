// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSslCertsRequest extends TeaModel {
    /**
     * <p>The name keyword for matching.</p>
     * 
     * <strong>example:</strong>
     * <p>ali</p>
     */
    @NameInMap("certNameLike")
    public String certNameLike;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>fun.iot.evideocloud.com.cn</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The page number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListSslCertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSslCertsRequest self = new ListSslCertsRequest();
        return TeaModel.build(map, self);
    }

    public ListSslCertsRequest setCertNameLike(String certNameLike) {
        this.certNameLike = certNameLike;
        return this;
    }
    public String getCertNameLike() {
        return this.certNameLike;
    }

    public ListSslCertsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListSslCertsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSslCertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
