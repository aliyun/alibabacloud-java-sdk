// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetUserFinishedAdRequest extends TeaModel {
    // adid
    @NameInMap("Adid")
    public Long adid;

    // clicklink
    @NameInMap("Clicklink")
    public String clicklink;

    // id
    @NameInMap("Id")
    public String id;

    // mediaid
    @NameInMap("Mediaid")
    public String mediaid;

    // tagid
    @NameInMap("Tagid")
    public String tagid;

    // uid
    @NameInMap("Uid")
    public String uid;

    public static GetUserFinishedAdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserFinishedAdRequest self = new GetUserFinishedAdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserFinishedAdRequest setAdid(Long adid) {
        this.adid = adid;
        return this;
    }
    public Long getAdid() {
        return this.adid;
    }

    public GetUserFinishedAdRequest setClicklink(String clicklink) {
        this.clicklink = clicklink;
        return this;
    }
    public String getClicklink() {
        return this.clicklink;
    }

    public GetUserFinishedAdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetUserFinishedAdRequest setMediaid(String mediaid) {
        this.mediaid = mediaid;
        return this;
    }
    public String getMediaid() {
        return this.mediaid;
    }

    public GetUserFinishedAdRequest setTagid(String tagid) {
        this.tagid = tagid;
        return this;
    }
    public String getTagid() {
        return this.tagid;
    }

    public GetUserFinishedAdRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
