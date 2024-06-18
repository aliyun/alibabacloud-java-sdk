// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTeamsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-05-15T11:29Z</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teams")
    public java.util.List<ListTeamsResponseBodyTeams> teams;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static ListTeamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTeamsResponseBody self = new ListTeamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTeamsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTeamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTeamsResponseBody setTeams(java.util.List<ListTeamsResponseBodyTeams> teams) {
        this.teams = teams;
        return this;
    }
    public java.util.List<ListTeamsResponseBodyTeams> getTeams() {
        return this.teams;
    }

    public ListTeamsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListTeamsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListTeamsResponseBodyTeamsIcon extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example/file-manage-files/zh-CN/202***13/ldet/avatar3.jpg">https://example/file-manage-files/zh-CN/202***13/ldet/avatar3.jpg</a></p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTeamsResponseBodyTeamsIcon build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsResponseBodyTeamsIcon self = new ListTeamsResponseBodyTeamsIcon();
            return TeaModel.build(map, self);
        }

        public ListTeamsResponseBodyTeamsIcon setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListTeamsResponseBodyTeamsIcon setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTeamsResponseBodyTeams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ding16b241fd05********288</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example/file-manage-files/zh-CN/202***13/ldet/XXXX.jpg">https://example/file-manage-files/zh-CN/202***13/ldet/XXXX.jpg</a></p>
         */
        @NameInMap("Cover")
        public String cover;

        /**
         * <strong>example:</strong>
         * <p>01472825524039877041</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>team_description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public ListTeamsResponseBodyTeamsIcon icon;

        /**
         * <strong>example:</strong>
         * <p>2023-05-15T11:29Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>team_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>lHiicjNFM2iSFYSdz2iPuI8ZwiEiE</p>
         */
        @NameInMap("TeamId")
        public String teamId;

        public static ListTeamsResponseBodyTeams build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsResponseBodyTeams self = new ListTeamsResponseBodyTeams();
            return TeaModel.build(map, self);
        }

        public ListTeamsResponseBodyTeams setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListTeamsResponseBodyTeams setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public ListTeamsResponseBodyTeams setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTeamsResponseBodyTeams setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListTeamsResponseBodyTeams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTeamsResponseBodyTeams setIcon(ListTeamsResponseBodyTeamsIcon icon) {
            this.icon = icon;
            return this;
        }
        public ListTeamsResponseBodyTeamsIcon getIcon() {
            return this.icon;
        }

        public ListTeamsResponseBodyTeams setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListTeamsResponseBodyTeams setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListTeamsResponseBodyTeams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTeamsResponseBodyTeams setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

    }

}
